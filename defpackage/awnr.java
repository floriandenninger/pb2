package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awnr extends aonm implements aooz {
    public static final awnr a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public int d;
    public float e;
    public int g;
    public awnp i;
    public boolean f = true;
    public String h = "";

    static {
        awnr awnrVar = new awnr();
        a = awnrVar;
        aonm.registerDefaultInstance(awnr.class, awnrVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awnrVar, awnrVar, null, 281539545, aoqn.MESSAGE, awnr.class);
    }

    private awnr() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"c", "d", "e", "f", "g", awnx.b, "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new awnr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (awnr.class) {
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
