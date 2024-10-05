package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tlb extends aonm implements aooz {
    public static final tlb a;
    private static volatile aopf e;
    public aoot b = aoot.a;
    public aoot c = aoot.a;
    public aony d = emptyProtobufList();

    static {
        tlb tlbVar = new tlb();
        a = tlbVar;
        aonm.registerDefaultInstance(tlb.class, tlbVar);
    }

    private tlb() {
    }

    public final aoot a() {
        aoot aootVar = this.b;
        if (!aootVar.b) {
            this.b = aootVar.a();
        }
        return this.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"b", tkz.a, "c", tla.a, "d", tkv.class});
            case NEW_MUTABLE_INSTANCE:
                return new tlb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (tlb.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
