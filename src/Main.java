import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Четное или нечетное число
        evenOrOdd(scanner);

        // Задача 2: Минимальное из трех чисел
        minimumOfThree(scanner);

        // Задача 3: Таблица умножения
        multiplicationTable();

        // Задача 4: Сумма чисел от 1 до N
        sumFrom1ToN(scanner);

        // Задача 5: Число Фибоначчи
        fibonacciNumbers(scanner);

        // Задача 6: Проверка простого числа
        checkPrimeNumber(scanner);

        // Задача 7: Обратный порядок чисел
        reverseOrder(scanner);

        // Задача 8: Сумма четных чисел
        sumEvenNumbers(scanner);

        // Задача 9: Реверс строки
        reverseString(scanner);

        // Задача 10: Количество цифр в числе
        countDigits(scanner);
        // Задача 11: Факториал числа
        factorial(scanner);

        // Задача 12: Сумма цифр числа
        sumOfDigits(scanner);

        // Задача 13: Палиндром
        checkPalindrome(scanner);

        // Задача 14: Найти максимальное число в массиве
        maxInArray(scanner);

        // Задача 15: Сумма всех элементов массива
        sumOfArrayElements(scanner);

        // Задача 16: Количество положительных и отрицательных чисел
        countPosNegNumbers(scanner);

        // Задача 17: Простые числа в диапазоне
        primeNumbersInRange(scanner);

        // Задача 18: Подсчет гласных и согласных в строке
        countVowelsAndConsonants(scanner);

        // Задача 19: Перестановка слов в строке
        reverseWordsInString(scanner);

        // Задача 20: Число Армстронга
        checkArmstrongNumber(scanner);

        scanner.close();
    }

    // Задача 1
    public static void evenOrOdd(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        System.out.println(number + (number % 2 == 0 ? " является четным числом." : " является нечетным числом."));
    }

    // Задача 2
    public static void minimumOfThree(Scanner scanner) {
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("Минимальное число: " + min);
    }

    // Задача 3
    public static void multiplicationTable() {
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }

    // Задача 4
    public static void sumFrom1ToN(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + N + " равна: " + sum);
    }

    // Задача 5
    public static void fibonacciNumbers(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int[] fib = new int[N];
        fib[0] = 0;
        if (N > 1) fib[1] = 1;

        for (int i = 2; i < N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.print("Первые " + N + " чисел Фибоначчи: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fib[i] + (i < N - 1 ? ", " : "\n"));
        }
    }

    // Задача 6
    public static void checkPrimeNumber(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " является простым числом." : " не является простым числом."));
    }

    // Задача 7
    public static void reverseOrder(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        System.out.println("Числа от " + N + " до 1 в обратном порядке:");
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }

    // Задача 8
    public static void sumEvenNumbers(Scanner scanner) {
        System.out.print("Введите первое число (A): ");
        int A = scanner.nextInt();

        System.out.print("Введите второе число (B): ");
        int B = scanner.nextInt();

        int sumEven = 0;
        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне от " + A + " до " + B + ": " + sumEven);
    }

    // Задача 9
    public static void reverseString(Scanner scanner) {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Обратный порядок строки: " + reversedStr);
    }

    // Задача 10
    public static void countDigits(Scanner scanner) {
        System.out.print("Введите целое число: ");
        String number = scanner.next();
        int digitCount = number.replaceAll("[^\\d]", "").length(); // Учитываем только цифры
        System.out.println("Количество цифр в числе: " + digitCount);
    }
    // Задача 11: Факториал числа
    public static void factorial(Scanner scanner) {
        System.out.print("Введите целое число для вычисления факториала: ");
        int N = scanner.nextInt();
        long fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        System.out.println("Факториал числа " + N + " равен: " + fact);
    }

    // Задача 12: Сумма цифр числа
    public static void sumOfDigits(Scanner scanner) {
        System.out.print("Введите целое число: ");
        String number = scanner.next();
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        System.out.println("Сумма цифр числа: " + sum);
    }

    // Задача 13: Палиндром
    public static void checkPalindrome(Scanner scanner) {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(str + (str.equals(reversedStr) ? " является палиндромом." : " не является палиндромом."));
    }

    // Задача 14: Найти максимальное число в массиве
    public static void maxInArray(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
    }

    // Задача 15: Сумма всех элементов массива
    public static void sumOfArrayElements(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    // Задача 16: Количество положительных и отрицательных чисел
    public static void countPosNegNumbers(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int positiveCount = 0, negativeCount = 0;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
    }


    // Задача 17: Простые числа в диапазоне
    public static void primeNumbersInRange(Scanner scanner) {
        System.out.print("Введите два целых числа A и B (A < B): ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.print("Простые числа в диапазоне от " + A + " до " + B + ": ");
        for (int num = A; num <= B; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Задача 18: Подсчет гласных и согласных в строке
    public static void countVowelsAndConsonants(Scanner scanner) {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        int vowelsCount = 0, consonantsCount = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouyAEIOUY";

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) >= 0) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelsCount);
        System.out.println("Количество согласных: " + consonantsCount);
    }

    // Задача 19: Перестановка слов в строке
    public static void reverseWordsInString(Scanner scanner) {
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Перестановка слов в строке: " + reversed.toString().trim());
    }

    // Задача 20: Число Армстронга
    public static void checkArmstrongNumber(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        System.out.println(originalNum + (sum == originalNum ? " является числом Армстронга." : " не является числом Армстронга."));
    }
}

