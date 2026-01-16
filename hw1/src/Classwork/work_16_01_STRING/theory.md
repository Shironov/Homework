### Длина строки

```java
String s = "Hello";
int len = s.length();  // 5
// Это МЕТОД, не свойство! С круглыми скобками.
// Не путай с arr.length для массивов (без скобок).
```

### Получение символа

```java
String s = "Hello";
char first = s.charAt(0);   // 'H'
char last = s.charAt(4);    // 'o'
// s.charAt(5) — StringIndexOutOfBoundsException!
```

### Подстрока

```java
String s = "Hello, World!";

String sub1 = s.substring(7);      // "World!" (с индекса 7 до конца)
String sub2 = s.substring(0, 5);   // "Hello" (с 0 до 5, не включая 5)
```

Запомни: `substring(start, end)` — end не включается!

### Поиск

```java
String s = "Hello, World!";

int pos1 = s.indexOf("World");      // 7 (позиция первого вхождения)
int pos2 = s.indexOf("Java");       // -1 (не найдено)
int pos3 = s.lastIndexOf("o");      // 8 (позиция последнего 'o')

boolean contains = s.contains("World");  // true
boolean starts = s.startsWith("Hello");  // true
boolean ends = s.endsWith("!");          // true
```

### Регистр

```java
String s = "Hello";

String upper = s.toUpperCase();  // "HELLO"
String lower = s.toLowerCase();  // "hello"

// Не забывай: s остаётся "Hello"!
```

### Замена

```java
String s = "Hello, World!";

String r1 = s.replace("World", "Java");   // "Hello, Java!"
String r2 = s.replace('o', '0');          // "Hell0, W0rld!"
String r3 = s.replaceAll("\\s", "_");     // Замена по регулярке
```

### Разбиение

```java
String s = "один,два,три";
String[] parts = s.split(",");  // ["один", "два", "три"]

String sentence = "Слова   разделены   пробелами";
String[] words = sentence.split("\\s+");  // Регулярка: один или более пробелов
```

### Объединение

```java
String[] words = {"Hello", "World"};
String joined = String.join(" ", words);  // "Hello World"
String joined2 = String.join(", ", "A", "B", "C");  // "A, B, C"
```

### Удаление пробелов

```java
String s = "  Hello  ";

String trimmed = s.trim();    // "Hello" (убирает пробелы по краям)
String stripped = s.strip();  // "Hello" (Java 11+, лучше с Unicode)

// strip() лучше, чем trim() — учитывает все Unicode-пробелы
```

### Проверки

```java
String s = "Hello";

boolean empty = s.isEmpty();     // false (пустая ли строка?)
boolean blank = s.isBlank();     // false (только пробелы? Java 11+)

"".isEmpty();    // true
"  ".isEmpty();  // false
"  ".isBlank();  // true
```


### Основные методы StringBuilder

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");        // Добавить в конец
sb.append(" ").append("World");  // Можно цепочкой

sb.insert(5, ",");         // Вставить по индексу: "Hello, World"
sb.delete(5, 6);           // Удалить: "Hello World"
sb.replace(6, 11, "Java"); // Заменить: "Hello Java"
sb.reverse();              // Развернуть: "avaJ olleH"

String result = sb.toString();  // Получить строку
```


### Спецификаторы формата

| Спецификатор | Тип | Пример |
|--------------|-----|--------|
| `%s` | Строка | `"Hello"` |
| `%d` | Целое число | `42` |
| `%f` | Дробное число | `3.14` |
| `%.2f` | Дробное, 2 знака | `3.14` |
| `%n` | Перевод строки | |
| `%10s` | Строка, ширина 10 | `"     Hello"` |
| `%-10s` | Выравнивание влево | `"Hello     "` |
| `%,d` | Число с разделителями | `1,234,567` |
