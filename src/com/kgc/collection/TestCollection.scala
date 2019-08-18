package com.kgc.collection

/**
  * Created by cjr on 2018/8/20.
  */
object TestCollection extends App{
  val testList = List.range(1,12)
  //一、过滤
  /**
    * 1.filter
    * 设定一个判定结果为布尔型的过滤条件，
    * 应用到集合的每一个元素上，返回的是集合里所有满足
    * 条件的元素构成的一个子集
    */
  def testFilter(): Unit ={
    testList.filter(x => x % 3 == 0).foreach(println)
    testList.filter(_ % 3 == 0).foreach(println)
  }
  //调用testFilter
//  testFilter()

  /**
    * 2.partition
    * filter类型操作的一个变种，同样是设定一个判定结果为布尔型的过滤条件，
    * 应用到集合的每一个元素上，返回的是两个个元素的Tuple,
    * 第一个元素是所有满足条件的元素构成一个集合，
    * 第二个元素是所有不满足条件的元素构成一个集合。
    */
  def testPartition(): Unit ={
    testList.partition( _%3 == 0)._1.foreach(println)
    testList.partition( _%3 == 0)._2.foreach(println)
  }
  //调用
//  testPartition()

  /**
    * 3.find
    * filter类型操作的一个变种，同样是设定一个判定结果为布尔型的过滤条件，
    * 返回集合中满足条件的第一个元素。
    */
  def testFind(): Unit ={
    testList.find(_%3 == 0).get
  }
  //调用testFind()
//  testFind()

  /**
    * 4.takeWhile
    * filter类型操作的一个变种，同样是设定一个判定结果为布尔型的过滤条件，
    * 从集合的第一个元素开始，逐一判定元素是否符合条件，
    * 在遇到第一个不符合条件的元素后随即结束过滤，
    * 返回的结果就是集合中前N个连续满足条件的元素。
    */
  def testTakeWhile(): Unit ={
    List(1, 2, 3, -4, 5, 6, 7, 8, 9, 10).takeWhile(_ > 0).foreach(println)
  }
  //调用testTakeWhile
//  testTakeWhile()


  //二、映射
  /**
    * 1.map
    * 设定一个针对元素的“转换”操作，应用到集合的每一个元素上，
    * 返回的结果是每个元素被转换之后的新值组成的新集合。
    * 新的集合与旧集合大小一样，但元素都是更新的，甚至类型也会发生变化。
    */
  def testMap(): Unit ={
    List(1, 2, 3, 4, 5).map(_ + 1).foreach(println)
    List("the", "quick", "brown", "fox", "jumped","over", "the", "lazy", "dog")
      .map(_.length).foreach(println)
  }
  //调用testMap()
//  testMap()

  /**
    * 2.flatmap
    * 对于嵌套的集合（即集合中的元素还是集合），
    * 如果希望把每一个嵌套的子集“转换”成一个新的子集，
    * 这时候就应该使用flatMap
    * flatMap，不单单应用于集合，它代表着一种很普遍的操作：
    * 对于某种嵌套的数据结构，如果它的某个操作会把它的嵌套元素转化
    * 或产生出新嵌套元素，则最终产生的将是一个“二维”的数据结构，
    * 也就是嵌套元素本身也是一个嵌套元素，这通常会让这个产出的结果很不好用，
    * 一个必备的工作就是把这个二维”的数据结构“压平”，重新拼接成一个一维的结构，
    * 这正是flatMap要做的事情。
    * 要特别注意的是flatMap使用的函数参数接收的是一个集合,
    * 返回的也是一个集合(GenTraversableOnce)，
    * 不能将一个集合元素“转换”成单一的值
    */
  def testFlatMap(): Unit ={
    List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9)).flatMap(_.toList)
      .foreach(println)
  }
  //调用testFlatMap
//  testFlatMap()

  //三、扁平化操作
  /**
    * flatten
    * 在函数式编程里经常会出现嵌套的集合，需要频繁地把这种嵌套的
    * 结构”压“成”扁平“的单一集合，这个动作在函数式编程里叫”flatten”。
    * 即：将所有嵌套的集合的元素一一取出逐一放置到一个集合中
    */
  def testFlatten(): Unit ={
    List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9)).flatten.foreach(println)
    List("the", "quick", "brown", "fox", "jumped","over", "the", "lazy", "dog")
      .flatten.foreach(println)
  }
  //调用testFlatten
//  testFlatten()

  //折叠
  /**
    * 1.reduceLeft
    * 如果我们把集合看成是一张纸条，每一小段代表一个元素，
    * 那么reduceLeft就将这张纸条从左向右”折叠”，
    * 最前面的两个元素会首先“重叠”在一起，
    * 这时会使用传给reduceLeft的参数函数进行计算，
    * 返回的结果就像是已经折叠在一起的两段纸条，
    * 它们已经是一个叠加的状态了，所以它，
    * 也就是上次重叠的结果会继续做为一个单一的值和下一个元素继续“叠加”，
    * 直到折叠到集合的最后一个元素
    */
  def reduceLeft(): Unit ={
    List.range(1, 10).reduceLeft(_+_)
  }
  //调用reduceLeft()
//  reduceLeft()

  /**
    * 2.reduceRight
    * 同理，reduceRight就将这张纸条从右向左”折叠”。
    * 要留心reduceRight的地方时：它的操作方向是从右到左，
    * 但是参数的顺序却并不是，而是依然第一参数是左边的元素，
    * 第二参数是右边的元素
    */
  def testReduceRight(): Unit ={
    println(List.range(1, 10).reduceRight(_ - _))
    // 8 - 9 = -1
    // 7 - (-1) = 8
    // 6 - 8 = -2
    // 5 - (-2) = 7
    // 4 - 7 = -3
    // 3 - (-3) = 6
    // 2 - 6 = -4
    // 1 - (-4) = 5
    // result: 5
  }
  //调用testReduceRight
//  testReduceRight()
  /**
    * 3.foldLeft
    * 与reduceLeft极为相似，
    * 只是它开始操作的第一个元素是以参数的形式传入的，
    * 而不是集合的第一个元素。
    */
  def testFoldLeft(): Unit ={
    print(List.range(1, 10).foldLeft(1)(_+_))
  }
  //调用testFoldLeft()
//  testFoldLeft()

  /**
    * 4.foldRight
    * 与reduceRight极为相似，只
    * 是它开始操作的第一个元素是以参数的形式传入的，
    * 而不是集合的最后一个元素。
    */
  def testFoldRight(): Unit ={
    println(List.range(1, 10).foldRight(5)(_ - _))
  }
  //调用testFoldRight
//  testFoldRight()
}
