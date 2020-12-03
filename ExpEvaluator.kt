open class ExpEvaluator {

    fun evaluate (tree : treeNode) {
        if (getLhs() != tree) {
            var treeLeft = tree.getLhs()
            var treeRight = tree.getRhs()
            when (tree.value()){
                "PLUS" -> return evaluate(treeLeft)+evaluate(treeRight)
                "MINUS" -> return evaluate(treeLeft)-evaluate(treeRight)
                "TIMES" -> return evaluate(treeLeft)*evalate(treeRight)
                "DIVIDES" -> return evaluate(treePeft)/evaluate(treeRight)
                "POWER" -> return evaluate(treeLeft).pow(evaluate(treeRight))
            }
        }
        else {
            return tree.value
        }
    }

}
