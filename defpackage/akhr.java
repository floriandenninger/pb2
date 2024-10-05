package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
enum akhr {
    CHANNEL_ITEM,
    REMOVE_CONTACT_ITEM,
    BLOCK_ITEM,
    UNBLOCK_ITEM,
    INVITE_ITEM,
    CANCEL_INVITE_ITEM,
    ACCEPT_INVITE_ITEM,
    REINVITE_ITEM,
    CHAT_ITEM;

    public final atct a(aqel aqelVar) {
        switch (this) {
            case CHANNEL_ITEM:
                atct atctVar = aqelVar.c;
                return atctVar == null ? atct.a : atctVar;
            case REMOVE_CONTACT_ITEM:
                atct atctVar2 = aqelVar.d;
                return atctVar2 == null ? atct.a : atctVar2;
            case BLOCK_ITEM:
                atct atctVar3 = aqelVar.e;
                return atctVar3 == null ? atct.a : atctVar3;
            case UNBLOCK_ITEM:
                atct atctVar4 = aqelVar.j;
                return atctVar4 == null ? atct.a : atctVar4;
            case INVITE_ITEM:
                atct atctVar5 = aqelVar.f;
                return atctVar5 == null ? atct.a : atctVar5;
            case CANCEL_INVITE_ITEM:
                atct atctVar6 = aqelVar.g;
                return atctVar6 == null ? atct.a : atctVar6;
            case ACCEPT_INVITE_ITEM:
                atct atctVar7 = aqelVar.i;
                return atctVar7 == null ? atct.a : atctVar7;
            case REINVITE_ITEM:
                atct atctVar8 = aqelVar.h;
                return atctVar8 == null ? atct.a : atctVar8;
            case CHAT_ITEM:
                atct atctVar9 = aqelVar.k;
                return atctVar9 == null ? atct.a : atctVar9;
            default:
                throw new IllegalArgumentException(name());
        }
    }
}
