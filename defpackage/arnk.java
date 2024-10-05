package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arnk extends aonm implements aooz {
    public static final arnk a;
    private static volatile aopf l;
    public int b;
    public arnb c;
    public boolean d;
    public int e;
    public arnh f;
    public arni g;
    public arnr h;
    public arns i;
    public asrj j;
    public asrk k;
    private byte m = 2;

    static {
        arnk arnkVar = new arnk();
        a = arnkVar;
        aonm.registerDefaultInstance(arnk.class, arnkVar);
    }

    private arnk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0002\u0003ဉ\u0004\u0004ဉ\u0006\u0006ဇ\u0001\u0007ဉ\u0005\bဉ\u0007\u000bဉ\b\fဉ\t", new Object[]{"b", "c", "e", armv.h, "f", "h", "d", "g", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new arnk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (arnk.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
