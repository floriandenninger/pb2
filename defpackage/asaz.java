package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asaz extends aonm implements aooz {
    public static final asaz a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asaz asazVar = new asaz();
        a = asazVar;
        aonm.registerDefaultInstance(asaz.class, asazVar);
    }

    private asaz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue6c6Ὺ\uf587淲\u0004\u0000\u0000\u0004\ue6c6Ὺᐼ\u0000\uf006⢾ᐼ\u0000\uf1f8⨰ᐼ\u0000\uf587淲ᐼ\u0000", new Object[]{"c", "b", aupv.class, aupl.class, apug.class, apun.class});
            case NEW_MUTABLE_INSTANCE:
                return new asaz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asaz.class) {
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
