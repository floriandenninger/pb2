package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class askp extends aonm implements aooz {
    public static final askp a;
    private static volatile aopf f;
    public int b;
    public Object d;
    public int c = 0;
    private byte g = 2;
    public String e = "";

    static {
        askp askpVar = new askp();
        a = askpVar;
        aonm.registerDefaultInstance(askp.class, askpVar);
    }

    private askp() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ျ\u0000\u0003ᐼ\u0000\u0004့\u0000\u0005်\u0000\u0006ဳ\u0000", new Object[]{"d", "c", "b", "e", aqyg.class});
            case NEW_MUTABLE_INSTANCE:
                return new askp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (askp.class) {
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
