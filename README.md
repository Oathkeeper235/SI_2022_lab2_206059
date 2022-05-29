# Втора лабораториска вежба по Софтверско инженерство

## Атанас Велчевски, бр. на индекс 206059

###  Control Flow Graph

![CFG](https://user-images.githubusercontent.com/53156298/170258573-7e53b327-225f-46a8-8a22-bfeef303ebda.png)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 7, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=6, па цикломатската комплексност изнесува 7.

### Тест случаи според критериумот Every statement

![EveryStatement](https://user-images.githubusercontent.com/53156298/170868350-1398d1cd-39c2-4892-8cf2-eb3feb7d57fd.png)
[EveryStatementCriteria.xlsx](https://github.com/Oathkeeper235/SI_2022_lab2_206059/files/8793349/EveryStatementCriteria.xlsx)

### Тест случаи според критериумот Every branch

![EveryBranch](https://user-images.githubusercontent.com/53156298/170868377-6aaaea1b-5782-4136-9b18-093ad3fc2372.png)
[EveryBranchCriteria.xlsx](https://github.com/Oathkeeper235/SI_2022_lab2_206059/files/8793350/EveryBranchCriteria.xlsx)

### Објаснување на напишаните unit tests

Кај every statement критериумот за секој тест случај(влез) со ѕвездичка се обележани сите statements кои се извршуваат со тој влез.

За првиот тест случај(листата ["#", "0", "#", "#", "0", "#", "#", "0", "#"]) програмата се извршува нормално и ја враќа листата ["#", "2", "#", "#", "2", "#", "#", "2", "#"].

За вториот тест случај(празна листа) програмата фрла IllegalArgumentException со порака "List length should be greater than 0".

За третиот тест случај(листата ["#", "0", "#"]) програмата фрла IllegalArgumentException со порака "List length should be a perfect square".

Кај every branch за секој тест случај(влез) со ѕвездичка се обележани сите branches кои се поминуваат со тој влез. Тест случаите се исти како и за every statement така што важат објаснувањата напишани погоре.
