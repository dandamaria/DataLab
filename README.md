### O programa apresenta um menu com vários exercícios:

#### ===== LABORATÓRIO DE DATAS =====

1. Mostrar data e hora atual Literalmente mostra a data e hora atual 
2. Formatar datas Pega um LocalDateTime e mostre em vários formatos. 
3. Calcular idade Você digita a data de nascimento e ele retorna sua idade no formato: "você tem x anos, y meses e w dias"
4. Quanto tempo falta? Informa quantos dias faltam para a data inserida pelo usuário 
5. Diferença entre datas Mostra a duração do tempo entre as duas datas 
6. Trabalhar com Instant Mostra a data e horário atual em diferentes localidades (Usando a classe Instant) 
7. Somar/Subtrair tempo Soma ou Subtrai tempo a datas (dias, semanas, meses ou anos) 
8. Comparar datas
9. Calendário pessoal 
0. Sair

### Exercício para fixar e entender o uso das seguintes classes: 
`LocalDate`, `LocalTime`, `LocalDateTime`, `Instant`, `Period`, `Duration`, `ChronoUnit`, `DateTimeFormatter`, `ZoneId`, `ZonedDateTime`

### Observações Importantes
> O objetivo desse projeto é relembrar o uso dessas classes em diferentes situações. Várias coisas poderiam ser simplificadas ou melhoradas e cabe uma boa refatoração nesse código. Vou deixar algumas coisas que observei e você pode resolver e abrir um **pull request** aqui.

- Todas as classes tem um `Scanner`, ao invés disso poderia criar um classe "Input" e dentro dela esse obj. Assim, toda vez que fosse usar era só chamá-la:
```
public class Input {

    public static final Scanner SCANNER =
            new Scanner(System.in);

}
```
Depois:
```
Input.SCANNER
```

- Só utilizei o tratamento de erro uma única vez dentro do Main, seria interessante tratar os outros inúmeros erros que podem ser gerados dentro de cada funcionalidade. É um bom exercício de Exceptions.
- A funcionalidade 'QuantoTempoFalta' mostra valores negativos quando o evento inserido já aconteceu. 
- Dentro de 'SomarSubtrairTempo' tem dois métodos que podem ser acessado livremente por outras classes (e não deveriam rs).

> Se quiserem adicionar outras melhorias, sintam-se á vontade!
