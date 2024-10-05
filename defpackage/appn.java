package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class appn extends aonm implements aooz {
    public static final appn a;
    private static volatile aopf f;
    public int b;
    public appm c;
    public aqdt d;
    public aqrf e;
    private byte g = 2;

    static {
        appn appnVar = new appn();
        a = appnVar;
        aonm.registerDefaultInstance(appn.class, appnVar);
    }

    private appn() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\uf321Ẑ\uf492䤳\u0003\u0000\u0000\u0003\uf321Ẑᐉ\u0001\ueb42☡ᐉ\u0000\uf492䤳ᐉ\u0003", new Object[]{"b", "d", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new appn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (appn.class) {
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
