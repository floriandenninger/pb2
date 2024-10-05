package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atmt extends aonm implements aooz {
    public static final atmt a;
    private static volatile aopf i;
    public int b;
    public Object d;
    public boolean g;
    public boolean h;
    private aota j;
    private aqyg k;
    public int c = 0;
    private byte l = 2;
    public String e = "";
    public aomf f = aomf.b;

    static {
        atmt atmtVar = new atmt();
        a = atmtVar;
        aonm.registerDefaultInstance(atmt.class, atmtVar);
    }

    private atmt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0002\u0001ဈ\u0000\u0002ည\u0002\u0003ᐉ\u0003\u0005ဇ\u0005\u0006ᐉ\u0001\u0007ဇ\u0006\b်\u0000\t့\u0000", new Object[]{"d", "c", "b", "e", "f", "k", "g", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new atmt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (atmt.class) {
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
