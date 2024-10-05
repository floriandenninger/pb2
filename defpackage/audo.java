package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class audo extends aonm implements aooz {
    public static final audo a;
    private static volatile aopf o;
    public int b;
    public aqyg c;
    public boolean d;
    public apxf e;
    public double f;
    public aqyg g;
    public apxf h;
    public apxf i;
    public apxf j;
    public double k;
    public aqyg l;
    public double m;
    public aqyg n;
    private byte p = 2;

    static {
        audo audoVar = new audo();
        a = audoVar;
        aonm.registerDefaultInstance(audo.class, audoVar);
    }

    private audo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\b\u0001ᐉ\u0000\u0003ဇ\u0002\u0004ᐉ\u0003\u0005က\u0004\u0006ᐉ\u0005\bᐉ\u0006\tᐉ\u0007\nᐉ\b\u000bက\t\fᐉ\n\rက\u000b\u000eᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new audo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (audo.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
