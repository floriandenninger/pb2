package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmp extends aonm implements aooz {
    public static final aqmp a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    private byte f = 2;
    public String d = "";

    static {
        aqmp aqmpVar = new aqmp();
        a = aqmpVar;
        aonm.registerDefaultInstance(aqmp.class, aqmpVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqmpVar, aqmpVar, null, 378918909, aoqn.MESSAGE, aqmp.class);
    }

    private aqmp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqmp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqmp.class) {
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
