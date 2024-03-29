package com.kgc.extractObject

/**
  * Created by cjr on 2018/8/20.
  */
object TestExtract {
  // 注入方法 (可选)
  def apply(user: String, domain: String) = {
    user +"@"+ domain
  }

  // 提取方法（必选）
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2){
      Some(parts(0), parts(1))
    }else{
      None
    }
  }
  println ("Apply 方法 : " + apply("Zara", "gmail.com"));
  println ("Unapply 方法 : " + unapply("Zara@gmail.com"));
  println ("Unapply 方法 : " + unapply("Zara Ali"));
}
