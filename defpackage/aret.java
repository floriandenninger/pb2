package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aret extends aonm implements aooz {
    public static final aret a;
    private static volatile aopf f;
    public int b;
    public Object d;
    public arey e;
    public int c = 0;
    private byte g = 2;

    static {
        aret aretVar = new aret();
        a = aretVar;
        aonm.registerDefaultInstance(aret.class, aretVar);
    }

    private aret() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\ue1c8㕰\uf152拄\u0003\u0000\u0000\u0003\ue1c8㕰ᐉ\u0000\uf707㥚ᐼ\u0000\uf152拄ᐼ\u0000", new Object[]{"d", "c", "b", "e", aumq.class, auwf.class});
            case NEW_MUTABLE_INSTANCE:
                return new aret();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aret.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
