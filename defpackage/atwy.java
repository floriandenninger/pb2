package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atwy extends aonm implements aooz {
    public static final atwy a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public int e;
    public boolean g;
    public int i;
    public aomf d = aomf.b;
    public String f = "";
    public String h = "";

    static {
        atwy atwyVar = new atwy();
        a = atwyVar;
        aonm.registerDefaultInstance(atwy.class, atwyVar);
        b = aonm.newSingularGeneratedExtension(atpo.b, atwyVar, atwyVar, null, 230806702, aoqn.MESSAGE, atwy.class);
    }

    private atwy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"c", "d", "e", atrx.a(), "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new atwy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (atwy.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
