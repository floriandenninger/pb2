package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqne extends aonm implements aooz {
    public static final aqne a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public int e;
    private byte g = 2;
    public String d = "";

    static {
        aqne aqneVar = new aqne();
        a = aqneVar;
        aonm.registerDefaultInstance(aqne.class, aqneVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqneVar, aqneVar, null, 384293593, aoqn.MESSAGE, aqne.class);
    }

    private aqne() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"c", "d", "e", aqkw.j});
            case NEW_MUTABLE_INSTANCE:
                return new aqne();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqne.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
