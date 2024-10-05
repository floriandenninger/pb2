package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozq extends aonm implements aooz {
    public static final aozq a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aozq aozqVar = new aozq();
        a = aozqVar;
        aonm.registerDefaultInstance(aozq.class, aozqVar);
    }

    private aozq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ued6a▻\uf829䦵\u0003\u0000\u0000\u0003\ued6a▻ᐼ\u0000\ueb3f㉼ᐼ\u0000\uf829䦵ᐼ\u0000", new Object[]{"c", "b", aqbs.class, aozn.class, aozm.class});
            case NEW_MUTABLE_INSTANCE:
                return new aozq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aozq.class) {
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
