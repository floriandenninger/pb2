package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aprf extends aonm implements aooz {
    public static final aprf a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public aprg e;
    private byte g = 2;
    public String d = "";

    static {
        aprf aprfVar = new aprf();
        a = aprfVar;
        aonm.registerDefaultInstance(aprf.class, aprfVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, aprfVar, aprfVar, null, 378640040, aoqn.MESSAGE, aprf.class);
    }

    private aprf() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aprf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aprf.class) {
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
