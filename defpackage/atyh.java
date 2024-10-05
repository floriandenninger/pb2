package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atyh extends aonm implements aooz {
    public static final atyh a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atyh atyhVar = new atyh();
        a = atyhVar;
        aonm.registerDefaultInstance(atyh.class, atyhVar);
    }

    private atyh() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf549᩸\uf7ce䩰\u0005\u0000\u0000\u0005\uf549᩸ᐼ\u0000ﰛỾᐼ\u0000ﲁ㚒ᐼ\u0000\uf492䤳ᐼ\u0000\uf7ce䩰ᐼ\u0000", new Object[]{"c", "b", aqdd.class, apfn.class, auta.class, aqrf.class, athe.class});
            case NEW_MUTABLE_INSTANCE:
                return new atyh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atyh.class) {
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
