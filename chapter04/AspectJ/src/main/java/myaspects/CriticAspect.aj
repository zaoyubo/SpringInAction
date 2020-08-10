package myaspects;

import concert.CriticismEngine;

public aspect CriticAspect {
    // injected
    private CriticismEngine criticismEngine;

    public CriticAspect() {
    }

    pointcut performance(): execution(* perform(..));

    after() returning(): performance() {
        System.out.println(criticismEngine);
        System.out.println(criticismEngine.getCriticism());
    }

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }


}
