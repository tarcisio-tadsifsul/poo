# Enunciado Exercicio 25 - Área Calculável

1. Crie um projeto interfaces e crie a interface AreaCalculavel
   com o método calculaArea() - sem parâmetros e que retorna um double.

2. Criar algumas classes que implementam AreaCalculavel:
   - Quadrado: possui um atributo lado.
   - Retangulo: possui os atributos base e altura.
   - Circulo: possui o atributo raio.

3. Criar uma classe de Teste. No método main crie um vetor de 5 posições que contém alguns objetos do tipo AreaCalculavel. Logo após, percorra esse vetor imprimindo a área de cada objeto.

## Resolucao

# Classe Teste

```java
package exe25AreaCalculavel;

public class Teste {
    public static void main(String[] args) {
        // Criando o vetor usando o nome da Interface
        AreaCalculavel[] formas = new AreaCalculavel[5];

        formas[0] = new Quadrado(2);
        formas[1] = new Retangulo(2, 4);
        formas[2] = new Circulo(3);
        formas[3] = new Quadrado(5);
        formas[4] = new Retangulo(6, 9);

        for (AreaCalculavel forma : formas) {
            System.out.println(
                    forma.getClass().getSimpleName() +
                            ":\t" +
                            forma.calculaArea());
        }
    }
}
```

# Classe Quadrado

```java

package exe25AreaCalculavel;

public class Quadrado implements AreaCalculavel {

    // Atributos
    private double lado;

    // Leitura | Escrita
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            this.lado = 1;
        }
    }

    // Construtores
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Metodos
    @Override
    public double calculaArea() {
        // A = (lado)² quando tiver valor de lado do quadrado
        // A = (diagonal)² / 2 quando tiver valor diagonal do quadrado
        return Math.pow(lado, 2);
    }

}
```

# Classe Retangulo

```java
package exe25AreaCalculavel;

public class Retangulo implements AreaCalculavel {

    // Atributos
    private double base;
    private double altura;

    // Leitura | Escrita
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            this.base = 1;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 1;
        }
    }

    // Construtores
    public Retangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }

    // Metodos
    @Override
    public double calculaArea() {
        // A = b * h
        return getBase() * getAltura();
    }

}
```

# Classe Circulo

```java
package exe25AreaCalculavel;

public class Circulo implements AreaCalculavel {
    // Atributos
    private double raio;
    private double pi = 3.14;

    // Leitura | Escrita
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            this.raio = 1;
        }
    }

    // Construtores
    public Circulo(double raio) {
        setRaio(raio);
    }

    // Metodos
    @Override
    public double calculaArea() {
        return this.pi * Math.pow(raio, 2);
    }

}
```

# Interface AreaCalculavel

```java
package exe25AreaCalculavel;

public interface AreaCalculavel {

    public double calculaArea();

}
```
