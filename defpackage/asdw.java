package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asdw extends aonm implements aooz {
    public static final asdw a;
    private static volatile aopf m;
    public int b;
    public arnb c;
    public avwv d;
    public astx e;
    public int g;
    public int h;
    public boolean i;
    public avsu j;
    public boolean k;
    public asdv l;
    private byte n = 2;
    public aony f = emptyProtobufList();

    static {
        asdw asdwVar = new asdw();
        a = asdwVar;
        aonm.registerDefaultInstance(asdw.class, asdwVar);
    }

    private asdw() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004Л\u0005ဌ\u0004\u0006ဌ\u0005\tဇ\u0006\nဉ\u0007\u000bဇ\b\fဉ\t", new Object[]{"b", "c", "d", "e", "f", askp.class, "g", aufb.d, "h", asaq.i, "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new asdw();
            case NEW_BUILDER:
                return new aone((int[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (asdw.class) {
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
