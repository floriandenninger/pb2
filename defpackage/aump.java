package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aump extends aonm implements aooz {
    public static final aump a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aump aumpVar = new aump();
        a = aumpVar;
        aonm.registerDefaultInstance(aump.class, aumpVar);
    }

    private aump() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue2d9ᩭ\ueaaaᾮ\u0003\u0000\u0000\u0003\ue2d9ᩭᐼ\u0000\ueb11ἑᐼ\u0000\ueaaaᾮᐼ\u0000", new Object[]{"c", "b", auzj.class, apmg.class, atdc.class});
            case NEW_MUTABLE_INSTANCE:
                return new aump();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aump.class) {
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
