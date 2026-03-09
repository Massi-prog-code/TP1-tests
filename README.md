# TP1 : Tests Unitaires & Couverture du Code


Ce document présente les bugs identifiés pour chaque exercice du TP1 portant sur les tests unitaires et la couverture du code.

---

## Exercice 1 : Palindrome
**Classe :** Palindrome  
**Bug :** Incrémentation/décrémentation inversée dans la boucle  
**Explication :** Les indices sont mis à jour avec `j++` et `i--` au lieu de `i++` et `j--`. Les pointeurs s'éloignent au lieu de se rapprocher, causant une `StringIndexOutOfBoundsException`.

---

## Exercice 2 : Anagram
**Classe :** Anagram  
**Bug :** Condition de boucle incorrecte  
**Explication :** La boucle utilise `i <= s1.length()` au lieu de `i < s1.length()`. Cela provoque un accès à un index invalide lorsque `i = s1.length()`, causant une `StringIndexOutOfBoundsException`.

---

## Exercice 3 : BinarySearch
**Classe :** BinarySearch  
**Bugs :** 2 problèmes (condition de boucle et comparaison)  
**Explications :**  
1. La boucle `while (low < high)` au lieu de `while (low <= high)` ne vérifie pas l'élément lorsque `low = high`.  
2. La comparaison `array[mid] <= element` au lieu de `array[mid] < element` entraîne une logique incorrecte pour la recherche binaire.

---

## Exercice 4 : QuadraticEquation
**Classe :** QuadraticEquation  
**Bug :** Comparaison directe de doubles  
**Explication :** La condition `delta == 0` est risquée à cause de la précision des nombres flottants. Elle peut rater les cas où `delta` est très proche de zéro mais pas exactement égal.

---

## Exercice 5 : RomanNumeral
**Classe :** RomanNumeral  
**Bugs :** 2 problèmes (condition de boucle et comparaison)  
**Explications :**  
1. `i <= symbols.length` au lieu de `i < symbols.length` provoque une `ArrayIndexOutOfBoundsException`.  
2. `while (n > values[i])` au lieu de `while (n >= values[i])` ne traite pas les cas où `n` est exactement égal à une valeur (ex: 1000, 5, 4).

---

## Exercice 6 : FizzBuzz
**Classe :** FizzBuzz  
**Bug :** Condition de validation incorrecte  
**Explication :** `if (n <= 1)` au lieu de `if (n < 1)` rejette incorrectement `n = 1` qui est un nombre valide.

---

## Conclusion 
- La plupart des bugs identifiés sont liés à des conditions de boucle ou des comparaisons incorrectes.  
- Il est important de faire des tests unitaires couvrant les cas limites pour détecter ce type de problème.  
- L’utilisation de doubles nécessite une attention particulière sur les comparaisons pour éviter les erreurs liées à la précision.
