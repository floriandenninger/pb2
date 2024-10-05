package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arst extends aonm implements aooz {
    public static final arst a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arst arstVar = new arst();
        a = arstVar;
        aonm.registerDefaultInstance(arst.class, arstVar);
    }

    private arst() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\uf264ᙛ\ue84d㫇\u0007\u0000\u0000\u0007\uf264ᙛᐼ\u0000金ᚆᐼ\u0000\uf8c1ᛍᐼ\u0000\uf67aᤚᐼ\u0000\uffc9ᦿᐼ\u0000\ue0a5㠴ᐼ\u0000\ue84d㫇ᐼ\u0000", new Object[]{"c", "b", ardk.class, ardm.class, ardi.class, ardl.class, ardj.class, atvy.class, atgn.class});
            case NEW_MUTABLE_INSTANCE:
                return new arst();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arst.class) {
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
