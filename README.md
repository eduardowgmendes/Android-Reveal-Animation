# Reveal View
This is a simple library that's create a Simple Reveal Animation on arbitrary `Views`

### Exemplo de Uso

![Example Case](https://raw.githubusercontent.com/eduardowgmendes/RevealAnimationClass/master/screenshots/example_remove_items.gif)

### Estrutura 
A biblioteca possui apenas uma classe utilitária com dois métodos estáticos: 

#### `public static void obscure(View v);`
Método estático que esconde a `view` deixando-a em um estado invisível.
```java
  RevealViewUtils.obscure(View view);
```

#### `public static void reveal(View v);`
Método estático que faz a `view` voltar a visibilidade normal. 
```java
  RevealViewUtils.reveal(View view);
```

### Veja o código 
![Source Code](https://github.com/eduardowgmendes/RevealAnimationClass/blob/master/app/src/main/java/br/com/testing/application/revealanimation/RevealAnimationUtil.java#L1)  
