package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyz extends aonm implements aooz {
    public static final aoyz a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aoyz aoyzVar = new aoyz();
        a = aoyzVar;
        aonm.registerDefaultInstance(aoyz.class, aoyzVar);
    }

    private aoyz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ueec5⬡\uf492䤳\u0003\u0000\u0000\u0003\ueec5⬡ᐼ\u0000\uef92㩰ᐼ\u0000\uf492䤳ᐼ\u0000", new Object[]{"c", "b", aoza.class, aozb.class, aqrf.class});
            case NEW_MUTABLE_INSTANCE:
                return new aoyz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aoyz.class) {
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
