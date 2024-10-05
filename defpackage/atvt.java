package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atvt extends aonm implements aooz {
    public static final atvt a;
    private static volatile aopf i;
    public int b;
    public apxf e;
    public aott f;
    public arfs g;
    public int h;
    private aota j;
    private byte k = 2;
    public String c = "";
    public String d = "";

    static {
        atvt atvtVar = new atvt();
        a = atvtVar;
        aonm.registerDefaultInstance(atvt.class, atvtVar);
    }

    private atvt() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0007ဌ\u0006\bᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", atvx.a(), "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atvt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (atvt.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
