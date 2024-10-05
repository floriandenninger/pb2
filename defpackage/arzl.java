package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arzl extends aonm implements aooz {
    public static final arzl a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arzl arzlVar = new arzl();
        a = arzlVar;
        aonm.registerDefaultInstance(arzl.class, arzlVar);
    }

    private arzl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue592᯦\uf492䤳\u0003\u0000\u0000\u0003\ue592᯦ᐼ\u0000\uf254⩭ᐼ\u0000\uf492䤳ᐼ\u0000", new Object[]{"c", "b", atdn.class, aozw.class, aqrf.class});
            case NEW_MUTABLE_INSTANCE:
                return new arzl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arzl.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
