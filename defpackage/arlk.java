package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arlk extends aonm implements aooz {
    public static final arlk a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arlk arlkVar = new arlk();
        a = arlkVar;
        aonm.registerDefaultInstance(arlk.class, arlkVar);
    }

    private arlk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\ue809ᶳ\uf649㊈\u0004\u0000\u0000\u0004\ue809ᶳᐼ\u0000\ue5d8☢ᐼ\u0000\uf696⽤ᐼ\u0000\uf649㊈ᐼ\u0000", new Object[]{"c", "b", apzx.class, apmp.class, audq.class, apzy.class});
            case NEW_MUTABLE_INSTANCE:
                return new arlk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arlk.class) {
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
