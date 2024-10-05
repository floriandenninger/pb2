package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aphi extends aonm implements aooz {
    public static final aphi a;
    private static volatile aopf k;
    public arfs b;
    public arfs c;
    public apxf d;
    public apxf e;
    public apxf f;
    public apxf g;
    public aott h;
    public aott i;
    private int l;
    private aota m;
    private byte n = 2;
    public aomf j = aomf.b;

    static {
        aphi aphiVar = new aphi();
        a = aphiVar;
        aonm.registerDefaultInstance(aphi.class, aphiVar);
    }

    private aphi() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006\bဉ\u0007\tᐉ\b\nည\t", new Object[]{"l", "b", "c", "d", "e", "f", "g", "h", "i", "m", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aphi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aphi.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
