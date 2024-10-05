package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arzr extends aonm implements aooz {
    public static final arzr a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arzr arzrVar = new arzr();
        a = arzrVar;
        aonm.registerDefaultInstance(arzr.class, arzrVar);
    }

    private arzr() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue7f5ណ\uf171㦖\u0004\u0000\u0000\u0004\ue7f5ណᐼ\u0000\ueaaaᾮᐼ\u0000\ue282㘿ᐼ\u0000\uf171㦖ᐼ\u0000", new Object[]{"c", "b", auov.class, atdc.class, aumb.class, athk.class});
            case NEW_MUTABLE_INSTANCE:
                return new arzr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arzr.class) {
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
