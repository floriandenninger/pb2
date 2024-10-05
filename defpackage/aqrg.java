package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqrg extends aonh implements aoni {
    public static final aqrg a;
    private static volatile aopf i;
    public boolean b;
    public boolean c;
    public aoxc f;
    public boolean g;
    public aqri h;
    private int j;
    private apxf k;
    private byte m = 2;
    public String d = "";
    public String e = "";

    static {
        aqrg aqrgVar = new aqrg();
        a = aqrgVar;
        aonm.registerDefaultInstance(aqrg.class, aqrgVar);
    }

    private aqrg() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0004\u0013\b\u0000\u0000\u0001\u0004ᐉ\u0006\tဇ\u0002\nဇ\t\rဈ\f\u000fဈ\r\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဉ\u0012", new Object[]{"j", "k", "b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqrg();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqrg.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
