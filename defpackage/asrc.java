package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asrc extends aonm implements aooz {
    public static final asrc a;
    private static volatile aopf h;
    public int b;
    public aulm c;
    public avgs d;
    public asjj e;
    public asrd f;
    public auah g;
    private byte i = 2;

    static {
        asrc asrcVar = new asrc();
        a = asrcVar;
        aonm.registerDefaultInstance(asrc.class, asrcVar);
    }

    private asrc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\uf697᳗\uf07f䚮\u0005\u0000\u0000\u0001\uf697᳗ᐉ\u0000\uec98↊ဉ\u0001\uf488┤ဉ\u0002\ue75e䔴ဉ\u0003\uf07f䚮ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asrc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asrc.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
