# Arrays



## 3 steps to make an array.

1. declaration.
2. memory allocation.
3. initialisation.
***

## 3 ways to make Arrays.

### 1. All in one

in this method [all 3 steps](https://github.com/manoharthakur351/just_for_u/blob/main/Java/Basics/Arrays.md#3-steps-to-make-an-array) are done at a time.
```
package manicrover;

public class Arry {

  public static void main(String[] args) {

    int[] marks = {1, 2};
    System.out.println(marks[1]);
  }
}

```

### 2. Three step method.
in this method first we declare a array then allocate it to a memory location and then finally we initialise it.
i.e. total 3 steps are done.

```
<Data type> <variable> ;
```
```
<variable> = new <data type>[<choose size of arry>];
```

```
<variable name>[<index number>] = <value of choosen data type>
```
_**example**_
```
package manicrover;

public class Arry {

  public static void main(String[] args) {

    boolean[] list;

    list = new boolean[2];

    list[1] = true;

    System.out.println(list[0]);

  }

}


```








### 3. Two step method.

in first step we declare and allocate an initialise in 2nd step.


```
<data type> [] <variable> = new <Data type>[<size of array>]
```

```
<variable>[<index>] = <value of choosen Data type>;
```

_**example**_
```
    char[] pass = new char[3];

    pass[0]='a';

    pass[1]='b';

    pass[2]='c';
```
