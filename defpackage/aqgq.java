package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqgq extends aonm implements aooz {
    public static final aqgq a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqgq aqgqVar = new aqgq();
        a = aqgqVar;
        aonm.registerDefaultInstance(aqgq.class, aqgqVar);
    }

    private aqgq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\ue818㢄ﶭ愤\u0003\u0000\u0000\u0003\ue818㢄ᐼ\u0000ﰏ娘ᐼ\u0000ﶭ愤ᐼ\u0000", new Object[]{"c", "b", apjf.class, apje.class, aued.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqgq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqgq.class) {
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
