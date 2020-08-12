import java.{util => ju}

object Quiz extends App{

    lazy val random=new ju.Random

    var value=new Array[Int](2)
    for(i <- 1 to Integer.parseInt(this.args(0))){
        
        for(randvalue <- 0 to 1){
            value(randvalue) = random.nextInt(10)+2
        }

        println(s"""赤玉${this.value(0)}個と白玉${this.value(1)}個の合計${this.value.sum}個の玉が入っている袋から同時に2個の玉を取り出すとき、
        |2個とも同じ色である確率を求めよ。\n""".stripMargin)
        
    }
}