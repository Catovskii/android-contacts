package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.DiffUtil;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback<K extends ListDiffInterface<K>> extends DiffUtil.ItemCallback<K> {


    public boolean areItemsTheSame(@NonNull K oldItem, @NonNull K newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull K oldItem, @NonNull K newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public Object getChangePayload(@NonNull K oldItem, @NonNull K newItem) {
        return newItem;
    }
}