package com.imooc.sparktest

object test02 extends App {

  abstract class UndoableAction(val description: String){
    def undo(): Unit
    def redo(): Unit
  }

  object DoNothingAction extends UndoableAction("Do nothing"){
    override def undo(): Unit = {}
    override def redo(): Unit = {}
  }

  val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)
  print(actions)

}
