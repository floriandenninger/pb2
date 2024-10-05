package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqde extends aonm implements aooz {
    public static final aqde a;
    private static volatile aopf m;
    public int b;
    public aqdd c;
    public apfn d;
    public auta e;
    public aqbm f;
    public athe g;
    public aqrf h;
    public athz i;
    public avbe j;
    public aoxa k;
    public aple l;
    private byte n = 2;

    static {
        aqde aqdeVar = new aqde();
        a = aqdeVar;
        aonm.registerDefaultInstance(aqde.class, aqdeVar);
    }

    private aqde() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\uf549᩸\ue79e걫\n\u0000\u0000\t\uf549᩸ᐉ\u0000ﰛỾᐉ\u0001ﲁ㚒ᐉ\u0002\ue6b3䤦ᐉ\u0003\uf492䤳ᐉ\u0005\uf7ce䩰ᐉ\u0004\uf8ac佗ᐉ\u0006\uf48b咡ᐉ\u0007殺绛ဉ\b\ue79e걫ᐉ\t", new Object[]{"b", "c", "d", "e", "f", "h", "g", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aqde();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aqde.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
