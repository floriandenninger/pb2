package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aulw extends aonm implements aooz {
    public static final aulw a;
    private static volatile aopf d;
    public boolean b;
    public boolean c;
    private int e;

    static {
        aulw aulwVar = new aulw();
        a = aulwVar;
        aonm.registerDefaultInstance(aulw.class, aulwVar);
    }

    private aulw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\r\u001f\u0002\u0000\u0000\u0000\rဇ\n\u001fဇ\u001a", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aulw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aulw.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
