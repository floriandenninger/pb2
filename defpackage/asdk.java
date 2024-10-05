package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asdk extends aonm implements aooz {
    public static final asdk a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public avuc f;
    public apvb g;
    private byte i = 2;
    public String d = "";
    public String e = "";

    static {
        asdk asdkVar = new asdk();
        a = asdkVar;
        aonm.registerDefaultInstance(asdk.class, asdkVar);
    }

    private asdk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asdk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asdk.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
