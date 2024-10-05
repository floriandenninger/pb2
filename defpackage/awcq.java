package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awcq extends aonm implements aooz {
    public static final awcq a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awcq awcqVar = new awcq();
        a = awcqVar;
        aonm.registerDefaultInstance(awcq.class, awcqVar);
    }

    private awcq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\ue018ឪ\ueea5㟳\u0005\u0000\u0000\u0005\ue018ឪᐼ\u0000社្ᐼ\u0000\uf74f⩫ᐼ\u0000\uf415㌷ᐼ\u0000\ueea5㟳ᐼ\u0000", new Object[]{"c", "b", awcg.class, awdf.class, arev.class, awde.class, awce.class});
            case NEW_MUTABLE_INSTANCE:
                return new awcq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awcq.class) {
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
