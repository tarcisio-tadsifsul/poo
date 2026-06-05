# Enunciado Exercicio 25 - Área Calculável

1. Crie um projeto interfaces e crie a interface AreaCalculavel
   com o método calculaArea() - sem parâmetros e que retorna um double.

2. Criar algumas classes que implementam AreaCalculavel:
   - Quadrado: possui um atributo lado.
   - Retangulo: possui os atributos base e altura.
   - Circulo: possui o atributo raio.

3. Criar uma classe de Teste. No método main crie um vetor de 5 posições que contém alguns objetos do tipo AreaCalculavel. Logo após, percorra esse vetor imprimindo a área de cada objeto.

## Entendimento

Não, a interface não contém objetos. O que o enunciado quer dizer é que o seu vetor vai guardar objetos de classes que implementam essa interface.

Você não pode dar new em uma Interface
Você está certo em desconfiar, porque uma interface é apenas um "contrato", uma casca vazia. O Java não deixa você fazer isso porque não faz sentido criar uma instância de algo que não tem implementação. A interface define o que deve ser feito, mas não como fazer.

O que é um "Objeto do tipo AreaCalculavel"?
Quando o enunciado diz "um vetor de 5 posições que contém alguns objetos do tipo AreaCalculavel", ele está usando o conceito de Polimorfismo.

Significa que o seu vetor aceita qualquer classe que tenha assinado o contrato da interface. Como Quadrado, Retangulo e Circulo implementam (implements AreaCalculavel), o Java passa a enxergar todas elas como se fossem "parentes" daquela interface.
