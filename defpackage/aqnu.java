package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnu extends aonm implements aooz {
    public static final aqnu a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public aqnt e;
    private byte g = 2;
    public String d = "";

    static {
        aqnu aqnuVar = new aqnu();
        a = aqnuVar;
        aonm.registerDefaultInstance(aqnu.class, aqnuVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqnuVar, aqnuVar, null, 314573701, aoqn.MESSAGE, aqnu.class);
    }

    private aqnu() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\b\u0002\u0000\u0000\u0000\u0002ဈ\u0002\bဉ\u0007", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqnu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqnu.class) {
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
