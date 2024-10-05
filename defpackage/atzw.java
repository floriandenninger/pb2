package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzw extends aonm implements aooz {
    public static final atzw a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atzw atzwVar = new atzw();
        a = atzwVar;
        aonm.registerDefaultInstance(atzw.class, atzwVar);
    }

    private atzw() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000ﮧ㴸\ue2ca碘\u0004\u0000\u0000\u0004ﮧ㴸ᐼ\u0000\uf8af䝐ᐼ\u0000\uf492䤳ᐼ\u0000\ue2ca碘ᐼ\u0000", new Object[]{"c", "b", atzv.class, aqrw.class, aqrf.class, atiu.class});
            case NEW_MUTABLE_INSTANCE:
                return new atzw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atzw.class) {
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
