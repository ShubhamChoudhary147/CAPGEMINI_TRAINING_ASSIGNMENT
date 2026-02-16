import java.util.List;
import java.time.LocalDateTime;
import java.util.*;

enum ActionType {
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    LOGIN,
    FAILED_LOGIN
}
enum Status {
    SUCCESS,
    FAILED
}


class LogEntry {

    private final int logId;
    private final String accountNumber;
    private final ActionType actionType;
    private final double amount;
    private final LocalDateTime timestamp;
    private final Status status;

    public LogEntry(int logId, String accountNumber,
                    ActionType actionType, double amount,
                    LocalDateTime timestamp, Status status) {

        this.logId = logId;
        this.accountNumber = accountNumber;
        this.actionType = actionType;
        this.amount = amount;
        this.timestamp = timestamp;
        this.status = status;
    }

    public int getLogId() {
        return logId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "logId=" + logId +
                ", accountNumber='" + accountNumber + '\'' +
                ", actionType=" + actionType +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                ", status=" + status +
                '}';
    }
}

interface SuspiciousDetector {
    List<LogEntry> detectSuspiciousLogs(List<LogEntry> allLogs);
}


class SimpleSuspiciousDetector implements SuspiciousDetector {

    @Override
    public List<LogEntry> detectSuspiciousLogs(List<LogEntry> allLogs) {

        List<LogEntry> suspicious = new ArrayList<>();
        Map<String, Deque<LogEntry>> accountRecentLogs = new HashMap<>();

        for (LogEntry log : allLogs) {

            accountRecentLogs.putIfAbsent(log.getAccountNumber(), new LinkedList<>());
            Deque<LogEntry> recent = accountRecentLogs.get(log.getAccountNumber());

            recent.addLast(log);
            if (recent.size() > 5) {
                recent.removeFirst();
            }

            // Rule 1: Withdrawal > 50,000
            if (log.getActionType() == ActionType.WITHDRAW && log.getAmount() > 50000) {
                suspicious.add(log);
            }

            // Rule 2: More than 3 FAILED_LOGIN in last 5 logs
            int failedCount = 0;
            for (LogEntry l : recent) {
                if (l.getActionType() == ActionType.FAILED_LOGIN) {
                    failedCount++;
                }
            }

            if (failedCount > 3) {
                suspicious.add(log);
            }
        }

        return suspicious;
    }
}

class LogManager {

    private int logCounter = 0;

    // Maintain insertion order
    private final List<LogEntry> allLogs = new ArrayList<>();

    // Fast account lookup
    private final Map<String, List<LogEntry>> accountIndex = new HashMap<>();

    // Fast action type search
    private final Map<ActionType, List<LogEntry>> actionIndex = new HashMap<>();

    private final SuspiciousDetector detector;

    public LogManager(SuspiciousDetector detector) {
        this.detector = detector;
    }

    // Feature 1: Add Log
    public void addLog(String accountNumber,
                       ActionType actionType,
                       double amount,
                       Status status) {

        logCounter++;

        LogEntry log = new LogEntry(
                logCounter,
                accountNumber,
                actionType,
                amount,
                LocalDateTime.now(),
                status
        );

        allLogs.add(log);

        accountIndex.putIfAbsent(accountNumber, new ArrayList<>());
        accountIndex.get(accountNumber).add(log);

        actionIndex.putIfAbsent(actionType, new ArrayList<>());
        actionIndex.get(actionType).add(log);
    }

    // Feature 2: Get Logs by Account
    public List<LogEntry> getLogsByAccount(String accountNumber) {
        return accountIndex.getOrDefault(accountNumber, new ArrayList<>());
    }

    // Feature 3: Recent N Logs
    public List<LogEntry> getRecentLogs(int n) {

        List<LogEntry> result = new ArrayList<>();
        int size = allLogs.size();

        for (int i = size - 1; i >= Math.max(0, size - n); i--) {
            result.add(allLogs.get(i));
        }

        return result;
    }

    // Feature 4: Suspicious Activity
    public List<LogEntry> detectSuspiciousActivity() {
        return detector.detectSuspiciousLogs(allLogs);
    }

    // Feature 5: Search by Action Type
    public List<LogEntry> searchByAction(ActionType actionType) {
        return actionIndex.getOrDefault(actionType, new ArrayList<>());
    }
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        LogManager manager = new LogManager(new SimpleSuspiciousDetector());

        while (true) {

            System.out.println("\n===== Secure Banking Log Manager =====");
            System.out.println("1. Add Log");
            System.out.println("2. Get Logs by Account");
            System.out.println("3. Get Recent Logs");
            System.out.println("4. Detect Suspicious Activity");
            System.out.println("5. Search by Action");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Account Number: ");
                    String acc = sc.next();

                    System.out.print("Action Type (DEPOSIT/WITHDRAW/TRANSFER/LOGIN/FAILED_LOGIN): ");
                    ActionType action = ActionType.valueOf(sc.next().toUpperCase());

                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();

                    System.out.print("Status (SUCCESS/FAILED): ");
                    Status status = Status.valueOf(sc.next().toUpperCase());

                    manager.addLog(acc, action, amt, status);
                    System.out.println("Log Added Successfully.");
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    String account = sc.next();
                    List<LogEntry> logs = manager.getLogsByAccount(account);
                    logs.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter N: ");
                    int n = sc.nextInt();
                    List<LogEntry> recent = manager.getRecentLogs(n);
                    recent.forEach(System.out::println);
                    break;

                case 4:
                    List<LogEntry> suspicious = manager.detectSuspiciousActivity();
                    suspicious.forEach(System.out::println);
                    break;

                case 5:
                    System.out.print("Action Type: ");
                    ActionType at = ActionType.valueOf(sc.next());
                    List<LogEntry> result = manager.searchByAction(at);
                    result.forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }

	}

}
