package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asew extends aonm implements aooz {
    public static final asew a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asew asewVar = new asew();
        a = asewVar;
        aonm.registerDefaultInstance(asew.class, asewVar);
    }

    private asew() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0000\uf321Ẑ\ue16f㳩\u0006\u0000\u0000\u0006\uf321Ẑᐼ\u0000\ueaaaᾮᐼ\u0000\uf42fⓣᐼ\u0000\ueaae┢ᐼ\u0000\ue282㘿ᐼ\u0000\ue16f㳩ᐼ\u0000", new Object[]{"c", "b", aqdt.class, atdc.class, auva.class, atsx.class, aumb.class, aslo.class});
            case NEW_MUTABLE_INSTANCE:
                return new asew();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asew.class) {
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
