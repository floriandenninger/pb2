package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqor extends aonm implements aooz {
    public static final aqor a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public aqnj e;
    private byte g = 2;
    public String d = "";

    static {
        aqor aqorVar = new aqor();
        a = aqorVar;
        aonm.registerDefaultInstance(aqor.class, aqorVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aqorVar, aqorVar, null, 264, aoqn.MESSAGE, aqor.class);
    }

    private aqor() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqor();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqor.class) {
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
