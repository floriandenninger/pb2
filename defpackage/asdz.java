package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asdz extends aonm implements aooz {
    public static final asdz a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asdz asdzVar = new asdz();
        a = asdzVar;
        aonm.registerDefaultInstance(asdz.class, asdzVar);
    }

    private asdz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\ue785⸓\ueb52齯\u0005\u0000\u0000\u0005\ue785⸓ᐼ\u0000\ue8ea㙁ᐼ\u0000瀞䢤ᐼ\u0000\uf492䤳ᐼ\u0000\ueb52齯ᐼ\u0000", new Object[]{"c", "b", avsq.class, aszh.class, astu.class, aqrf.class, avst.class});
            case NEW_MUTABLE_INSTANCE:
                return new asdz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asdz.class) {
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
