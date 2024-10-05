package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupz extends aonm implements aooz {
    public static final aupz a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aupz aupzVar = new aupz();
        a = aupzVar;
        aonm.registerDefaultInstance(aupz.class, aupzVar);
    }

    private aupz() {
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
                return newMessageInfo(a, "\u0001\u0004\u0001\u0000\uf321Ẑ\uee20䐄\u0004\u0000\u0000\u0004\uf321Ẑᐼ\u0000ￌ䉥ᐼ\u0000\ue39b䐄ᐼ\u0000\uee20䐄ᐼ\u0000", new Object[]{"c", "b", aqdt.class, auqv.class, avov.class, avox.class});
            case NEW_MUTABLE_INSTANCE:
                return new aupz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aupz.class) {
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
